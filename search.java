/*package whatever //do not write package name here */
/*
  An array is bitonic if it is comprises of an increasing sequence of integers followed immediately by a decreasing sequence of integers.
Given such a array, you need to find a element X in it and print its index.
In case, X does not exist in the array print "OOPS! NOT FOUND" without quotes.
 */
import java.util.*;
import java.lang.*;
import java.io.*;

class search {
	public static void main (String[] args) {
		//code
		int N, x, t;
		Scanner sc = new Scanner(System.in);
		t = sc.nextInt();
		N = sc.nextInt();
		x = sc.nextInt();
		
		int[] arr = new int[N];
		for(int i=0;i<N;i++){
		    arr[i] = sc.nextInt();
		}
		
		
		
		while(t !=0){
		    t--;
		    boolean found = false;
		    int index = 0;
		    int mid = 0, low = 0, high =0;
		    high = N-1;
		    mid = (low + high)/2;
		    if(x == arr[mid]){
		        found = true;
		        index = mid;
		    }
		     else if(x < arr[mid]){
		            //first half
		          for(int j=0;j<mid;j++){
		                if(x==arr[j]){
		                    found = true;
		                    index = j;}
		            }
		            
		        }else{
		            //second half
		              for(int k=mid + 1;k<N;k++){
		                  if(x==arr[k]){
		                    found = true;
		                    index = k;}
		       
		            }
		        }
		        
		        if(found)
		            System.out.println(index);
		         else
		            System.out.println("OOPS! NOT FOUND");
		  
		}
	}
}

/*
1
298 721
1 9 11 16 17 18 22 33 38 40 53 54 58 68 70 72 82 84 87 88 98 100 105 110 113 115 117 123 127 128 132 135 137 142 148 150 153 155 156 160 171 172 173 174 180 182 184 185 190 196 198 199 200 212 218 224 225 226 232 255 264 265 267 270 279 281 282 284 286 290 296 297 298 299 301 309 310 311 314 315 326 327 335 338 339 342 351 352 353 355 356 361 362 365 369 377 379 383 394 399 400 405 413 416 422 427 429 434 438 440 446 466 477 483 484 488 490 491 492 495 507 512 518 526 529 533 536 538 539 540 542 549 552 553 556 560 564 567 571 578 583 584 588 591 594 596 604 611 619 622 632 637 639 640 642 644 650 652 658 663 666 668 673 674 680 683 686 694 699 709 716 717 721 723 736 761 762 763 775 777 778 784 788 791 806 814 815 816 821 826 828 829 834 840 845 851 852 853 854 857 858 860 861 872 876 878 887 889 891 893 899 911 929 931 932 933 950 953 955 956 957 958 963 970 971 973 977 978 983 986 988 990 991 992 998 1000 982 981 968 961 949 934 920 913 903 869 824 798 794 730 727 720 719 678 667 660 625 574 563 497 486 476 475 473 470 469 425 419 384 378 359 344 324 306 305 287 246 239 217 208 193 175 161 157 154 141 134 126 101 76 63 51 43 31 30 20 12 3

*/