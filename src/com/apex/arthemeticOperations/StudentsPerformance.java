package com.apex.arthemeticOperations;

/**
 * a java program to calculate total marks and average marks of a student
 */

public class StudentsPerformance {
		int numberOfSubjects=6;
		int sub1,sub2,sub3,sub4,sub5,sub6;
		
		public StudentsPerformance(int sub1, int sub2, int sub3, int sub4,int sub5, int sub6) {
			this.sub1 = sub1;
			this.sub2 = sub2;
			this.sub3 = sub3;
			this.sub4 = sub4;
			this.sub5 = sub5;
			this.sub6 = sub6;
		}
		
		public int getSub1() {
			return sub1;
		}
		public int getSub2() {
			return sub2;
		}
		public int getSub3() {
			return sub3;
		}
		public int getSub4() {
			return sub4;
		}
		public int getSub5() {
			return sub5;
		}
		public int getSub6() {
			return sub6;
		}
		public int getTotal() {
			return sub1+sub2+sub3+sub4+sub5+sub6;
		}
		public double getAverage() {
			return (double)getTotal()/(double)numberOfSubjects;
		}

		@Override
		public String toString() {
			return "StudentsPerformance [getSub1()=" + getSub1()
					+ ", getSub2()=" + getSub2() + ", getSub3()=" + getSub3()
					+ ", getSub4()=" + getSub4() + ", getSub5()=" + getSub5()
					+ ", getSub6()=" + getSub6() + ", getTotal()=" + getTotal()
					+ ", getAverage()=" + getAverage() + "]";
		}
		
}
