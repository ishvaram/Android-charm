package com.charmlove.lovetest;

public class FindNumber {
	
	public static int find_age(int first, int second)
	{
		
		
		int dif = Math.abs(first-second);
		int res = 0;
		
		switch (dif)
		{
			case 0:
				res = 100;
			break;
			case 1:
				res = 97;
			break;
			case 2:
				res = 94;
			break;
			case 3:
				res = 91;
			break;
			case 4:
				res = 88;
			break;
			case 5:
				res = 85;
			break;
			case 6:
				res = 82;
			break;
			case 7:
				res = 79;
			break;
			case 8:
				res = 76;
			break;
			case 9:
				res = 73;
			break;
			case 10:
				res = 70;
			break;
			case 11:
				res = 67;
			break;
			case 12:
				res = 64;
			break;
			case 13:
				res = 61;
			break;
			case 14:
				res = 58;
			break;
			case 15:
				res = 55;
			break;
			case 16:
				res = 52;
			break;
			case 17:
				res = 49;
			break;
			case 18:
				res = 46;
			break;
			case 19:
				res = 43;
			break;
			case 20:
				res = 40;
			break;
			case 21:
				res = 37;
			break;
			case 22:
				res = 34;
			break;
			case 23:
				res = 31;
			break;
			case 24:
				res = 28;
			break;
			case 25:
				res = 25;
			break;
			case 26:
				res = 22;
			break;
			case 27:
				res = 29;
			break;
			case 28:
				res = 16;
			break;
			case 29:
				res = 13;
			break;
			case 30:
				res = 10;
			break;
			case 31:
				res = 7;
			break;
			case 32:
				res = 4;
			break;
			case 33:
				res = 1;
			break;
		}
		if (dif>=34 && dif<=47)
		{
			res =1;
		}
		
		return res;
	}
	
	public static int find_name(int first, int second)
	{
		int dif = Math.abs(first-second);
		int res = 0;
		
		if (dif==0 || dif == 1 || dif == 2 || dif == 3 || dif == 4)
		{
			res = 100;
		}
		if (dif==5 || dif == 6 || dif == 7 || dif == 8 || dif ==9)
		{
			res = 95;
		}
		if (dif==10 || dif == 11 || dif == 12 || dif == 13 || dif == 14)
		{
			res = 90;
		}
		if (dif==15 || dif == 16 || dif == 17 || dif == 18 || dif ==19)
		{
			res = 85;
		}
		if (dif==20 || dif == 21 || dif == 22 || dif == 23 || dif == 24)
		{
			res = 80;
		}
		if (dif==25 || dif == 26 || dif == 27 || dif == 28 || dif ==29)
		{
			res = 75;
		}
		if (dif==30 || dif == 31 || dif == 32 || dif == 33 || dif == 34)
		{
			res = 70;
		}
		if (dif==35 || dif == 36 || dif == 37 || dif == 38 || dif ==39)
		{
			res = 65;
		}
		if (dif==40 || dif == 41 || dif == 42 || dif == 43 || dif == 44)
		{
			res = 60;
		}
		if (dif==45 || dif == 46 || dif == 47 || dif == 48 || dif ==49)
		{
			res = 55;
		}
		if (dif==50 || dif == 51 || dif == 52 || dif == 53 || dif == 54)
		{
			res = 50;
		}
		if (dif==55 || dif == 56 || dif ==57 || dif == 58 || dif ==59)
		{
			res = 45;
		}
		if (dif==60 || dif == 61 || dif == 62 || dif == 63 || dif == 64)
		{
			res = 40;
		}
		if (dif==65 || dif == 66 || dif == 67 || dif == 68 || dif ==69)
		{
			res = 35;
		}
		if (dif==70 || dif == 71 || dif == 72 || dif == 73 || dif == 74)
		{
			res = 30;
		}
		if (dif==75 || dif == 76 || dif == 77 || dif == 78 || dif ==79)
		{
			res = 25;
		}
		if (dif==80 || dif == 81 || dif == 82 || dif == 83 || dif == 84)
		{
			res = 20;
		}
		if (dif==85 || dif == 86 || dif == 87 || dif == 88 || dif ==89)
		{
			res = 15;
		}
		if (dif==90 || dif == 91 || dif == 92 || dif == 93 || dif == 94)
		{
			res = 10;
		}
		if (dif==95 || dif == 96 || dif == 97 || dif == 98 || dif ==99)
		{
			res = 5;
		}
		if (dif==100 || dif ==101 || dif == 102 || dif == 103 || dif == 104)
		{
			res = 5;
		}
		if (dif>=105 && dif<=250)
		{
			res = 5;
		}

		return res;
	}
	
	
	public static int generate(int name, int age, int zod)
	{
		
		return (name+age+zod)/3;
	}
	

}
