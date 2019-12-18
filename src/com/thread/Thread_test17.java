package com.thread;

import java.util.concurrent.*;

public class Thread_test17 {

	public static void main(String[] args) throws InterruptedException,
												  ExecutionException{
		CompletableFuture<Integer> completableFuture1= 
								  CompletableFuture.supplyAsync(() ->{
			int sum = 0;
			int i = 1;
			while (i ++< 11) {
				sum += i;
				System.out.println(Thread.currentThread().getName()
						+ "线程任务正在执行---i:" + i);
			}
			return sum;
		});
		CompletableFuture<Integer> completableFuture2= 
				  CompletableFuture.supplyAsync(() ->{
			int sum = 0;
			int j = 11;
			while (j ++< 21) {
				sum += j;
				System.out.println(Thread.currentThread().getName()
						+ "线程任务正在执行---j:" + j);
			}
			return sum;
		});
		CompletableFuture completableFuture3 =
					completableFuture1.thenCombine(completableFuture2,
				(result1, result2) ->result1 +result2);
		System.out.println("1到10相加的结果为:" + completableFuture3.get());
	}

}

