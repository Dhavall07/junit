package com.epam.junit_deom;

public class RemoveA {

	public String work(String string) {
		String str = "";
		for(int i = 0;i<string.length();i++)
		{
			if((i==0 || i==1)&& (string.charAt(i)=='A'))
			{
				continue;
			}
			else
			{
				str = str + string.charAt(i);
			}
		}
		return str;
	}

}
