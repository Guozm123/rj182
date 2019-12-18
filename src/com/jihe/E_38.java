package com.jihe;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class E_38 {

	public static void main(String[] args) {
		List<String>list=Arrays.asList("张三","李四","张晓明","张扬");
		Stream<String>ps=list.parallelStream();
		System.out.println(ps.isParallel());
		Stream<String>stream=Stream.of("张三","李四","张晓明","张扬");
		Stream<String>parallel=stream.parallel();
		System.out.println(parallel.isParallel());

	}

}
