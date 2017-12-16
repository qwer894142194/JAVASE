import java.util.Random;

public class DoubleBall {
	// ����һ��˫ɫ������
	// ���� ���
	 private int n[]=new int[6];   
	 // ����һ���µ����� �����˷� �����������,������ĳ�����6 ����������˫ɫ������
	    private Random r=new Random();   
	     // ����һ�������������
	    
	    public int[] doubleBal(){   
	           
	        int i=0;   
	        while(i<n.length){   
	            n[i]=r.nextInt(33)+1;   
	            if(compared(n,i,n[i])){   
	                i++;   
	            }   
	        }   
	        return n;   
	    }   
	       
	    public boolean compared(int n[],int index,int d){   
	        boolean flag=true;   
	        for(int i=0;i<index;i++){   
	            if(n[i]==d){   
	                flag=false;   
	            }   
	        }   
	        return flag;   
	    }   
	       
	    public void sortArray(int n[]){   
	        for(int i=0;i<n.length;i++){   
	            int temp;   
	            for(int j=0;j<n.length-i-1;j++){   
	                if(n[j]>n[j+1]){   
	                    temp=n[j];   
	                    n[j]=n[j+1];   
	                    n[j+1]=temp;   
	                }   
	            }   
	        }   
	    }   
	       
	    public void printNums(int n){   
	        for(int k=0;k<n;k++){   
	            int [] n1=doubleBal();   
	            sortArray(n1);   
	            System.out.print("����");   
	            for(int i=0;i<6;i++){   
	                System.out.print("|"+add0(n1[i]));   
	            }   
	            System.out.print("|����"+add0(r.nextInt(16)+1)+"|"); 
	            
	        }   
	    }   
	       
	    public String add0(int n){   
	        String str="";  
	        if(n<10){   
	            str="0"+n;   
	        }else{   
	            str=n+"";   
	        }   
	        return str;   
	    }   
}  
	   
