package java8features.java8features_multithreading;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class appMethods {

	public double avearagelist(List<Integer> l) {
		return l.stream().mapToInt(i->i).average().getAsDouble();
	}
	public List<String> check_a(List<String> list){
		return list.stream().filter(s->s.startsWith("a")).filter(s->s.length()==3).collect(Collectors.toList());
	}
	public List<String> palindrome(List<String> list){
		List<String> list2=new ArrayList<String>();
		for (String i:list) { 
			if((IntStream.range(0,i.length()/2).noneMatch(j->i.charAt(j)!=i.charAt(i.length()-j-1)))){
				list2.add(i);
			}
			
		}
		return list2;
	}
}
