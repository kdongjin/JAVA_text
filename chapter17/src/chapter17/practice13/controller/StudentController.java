package chapter17.practice13.controller;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import chapter17.practice13.model.StudentVO;

public class StudentController {
	private List<StudentVO> sl;
	private List<StudentVO> csl;
	
	public StudentController() {
		sl = new ArrayList<StudentVO>();
	}
	
	//입력(insert)
	public int addStudent(StudentVO svo) {
		try {
			if(svo != null) {
				sl.add(svo);
			}else {
				return 0; 
			}
			return 1; 
		} catch (Exception e) {
			return 0;
		}
	}
	//출력(select)
	public List<StudentVO> printAll(){
		return sl; 
	}
	//검색(select)
	public StudentVO searchStudent(String name, int id) {
		for (StudentVO svo : sl) {
			if(svo.getId() == id && svo.getName().equals(name)) {
				return svo; 
			}
		}
		return null; 
	}
	//삭제(delete)
	public StudentVO removeStudent(String name, int id) {
		for (StudentVO svo : sl) {
			if(svo.getId() == id && svo.getName().equals(name)) {
				sl.remove(svo);
				return svo; 
			}
		}
		return null; 
	}
	//수정(update)
	public StudentVO updateStudent(int id, String name, StudentVO student) {
		for (int i = 0; i < sl.size(); i++) {
			//배열 sl[i]  == sl.get(i)
			if(sl.get(i).getId() == id && sl.get(i).getName().equals(name)) {
				sl.set(i, student);
				return student; 
			}
		}
		return null; 
	}
	//정렬(select) : 깊은복사 얕은복사(0)
	public List<StudentVO> sortByTotalDesc() {
        try {
            csl = new ArrayList<StudentVO>(sl);

            Collections.sort(csl);

            for (int i = 0; i < csl.size(); i++) {
                if(i==0) { 
                    csl.get(i).setRank(1); 
                    continue;
                }
                if(csl.get(i).getTotal() == csl.get(i-1).getTotal())
                    csl.get(i).setRank(csl.get(i-1).getRank());
                else csl.get(i).setRank(i+1);
            }
            return csl;
        } catch (Exception e) {
            return null;
        }
    } // end func
	
	public List<StudentVO> sortByNameAsc() {
        try {
            csl = new ArrayList<StudentVO>(sl);

            Collections.sort(csl, new AscendingNameStudent());

            return csl;
        } catch (Exception e) {
            return null;
        }
    } // end func
}















