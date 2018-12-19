package algorithm02;

import java.util.ArrayList;
import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//과제 
		Scanner scan = new Scanner(System.in);
		
		int num = scan.nextInt();//5
		int den = scan.nextInt();//7
		
		ArrayList<Integer> nums_list = new ArrayList<>();
		ArrayList<Integer> dens_list = new ArrayList<>();
		
		nums_list.add(0);//0
		nums_list.add(1);//1
		dens_list.add(1);//2
		dens_list.add(0);//3
		
		int flag = 0;
		int size = nums_list.size();
		
		while(true) {
			
			int cur = 0;
			for (int j = 0; j < size-1; j++ ) {
//				System.out.println(cur);
				int add_num = nums_list.get(cur) + nums_list.get(cur + 1);
				int add_den = dens_list.get(cur) + dens_list.get(cur + 1);
				if (add_num == num && add_den == den) flag = 1;
				nums_list.add(cur+1, add_num);
				dens_list.add(cur +1, add_den);
				cur += 2;
			
			}
			size = nums_list.size();
			
			System.out.println(nums_list.toString());
			System.out.println(dens_list.toString());
			
			if (flag == 1) {
				break;
			}
			
		}

        int first = 0;
        int last = nums_list.size()-1;
        int mid;
        String path ="";
        
        while (first <= last) {

                mid = (first + last) / 2;
                int temp = 0;
                System.out.println(mid);
                
                if (num == nums_list.get(mid) && den == dens_list.get(mid)) {
                        break;
                }

                else {
                		for (int i = first; i < last; i++) {
                			if (num == nums_list.get(i) && den == dens_list.get(i)) {
                				temp = i;
                			}
                		}
                		if (temp < mid) {
                			 last = mid;
                			 path += "L";
                		}
                		else {
                			first = mid + 1;
                			path += "R";
                		}
                               
                }
        }
        System.out.println(path);
	}

}
