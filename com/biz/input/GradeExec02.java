package com.biz.input;

import java.util.ArrayList;
import java.util.List;

import com.biz.input.service.GradeService;
import com.biz.input.vo.GradeVO;

public class GradeExec02 {

	public static void main(String[] args) {

		List<GradeService> gradeList = new ArrayList();

		for (int i = 0; i < 5; i++) {
			System.out.println(i + "번째 공간");
			GradeService gS = new GradeService();
			if (!gS.gradeInput()) {
				i--;
				continue;
			}
			gS.makeSumAndAvg();
			gradeList.add(gS);
		}

		for (GradeService s : gradeList) {
			System.out.println(s.gVO.toString());
		}

	}

}