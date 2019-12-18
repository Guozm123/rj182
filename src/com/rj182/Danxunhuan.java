package com.rj182;

public class Danxunhuan {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		String[] yd= {"管理学院","教育学院","表演学院","音乐学院","设计学院","中专部","饮食文化学院"};
	/*用下标表示每个元素
	 * 0 1 2 3 4 5 
	 * 第一轮对阵
	 * 0vs5 1vs4 2vs3
	 * 第二轮对阵
	 * 对阵之前，改变数组之间的元素位置：
	 * 将最后一组移动到第一支队伍前，其他队伍不变
	 * 0 5 1 2 3 4
	 * 0vs4 5vs3 1vs2
	 * 第三轮对阵
	 * 对阵之前，改变数组之间的元素位置：
	 * 将最后一组移动到第一支队伍前，其他队伍不变
	 * 0 4 5 1 2 3 
	 * 0vs3 4vs2 1vs5
	 * 第四轮对阵
	 * 对阵之前，改变数组之间的元素位置：
	 * 将最后一组移动到第一支队伍前，其他队伍不变
	 * 0 3 4 5 1 2  
	 * 2vs0 3vs1 5vs4
	 * 第五轮对阵
	 * 对阵之前，改变数组之间的元素位置：
	 * 将最后一组移动到第一支队伍前，其他队伍不变
	 * 0 2 3 4 5 1   
	 * 1vs0 2vs5 3vs4
	 * */
	System.out.println("第九届江汉艺术职业学院篮球赛对阵表：");
	//外循环对应轮次
	for (int i =1; i < yd.length; i++) {
		System.out.println("第"+i+"轮");
		if (i>1) {
			int k=yd.length-1;
			String stemp=yd[k];
			for(; k > 1;k--)
				yd[k]=yd[k-1];
			yd[1]=stemp;
		}
		//内循环进行对阵
	for (int j =0; j<yd.length/2; j++) {
		System.out.println(yd[j]+"VS"+yd[yd.length-j-1]);
		if(j==yd.length/2-1) {
			System.out.println(yd[j+1]+"轮空");
		}
	}
	}
	}
}
