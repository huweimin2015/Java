/*
����һ���򵥵ı�ʾ���ε�Rectangle�࣬��������������

��1������������Ա����height��width����ʾ���εĳ��Ϳ�����Ϊ���� 
��2������һ��getArea���������ؾ��ε���� 
��3������һ��getPerimeter���������ؾ��ε��ܳ� 
��4����main�����У����������2�������ֱ���Ϊ���εĳ��Ϳ�����getArea��getPermeter���������㲢���ؾ��ε�������ܳ�

 ���룺
 ����2�����������м��ÿո�������ֱ���Ϊ���εĳ��Ϳ����磺5 8

 �����
 ���2�����������м��ÿո�������ֱ��ʾ���ε�������ܳ������磺40 26
*/
/*
public class rectangle{
	public static void main(String[] args){
        
        //��ó��Ϳ������
        Scanner input=new Scanner(System.in); 
	String LW=input.nextLine();
                  
 	//������õ����ַ���ת��Ϊ���Ϳ����ֵ

        //���������ܳ� 
	}
}
*/
import java.util.Scanner;
public class  rectangle {
    static int height,weight;
    static int getArea(){        return height*weight;    }
    static int getPerimeter(){        return 2*(height+weight);    }
    public static void main(String[] args) {
   // write your code here
        Scanner input=new Scanner(System.in);
        height=input.nextInt();
        weight=input.nextInt();
        System.out.print(getArea());
        System.out.print(" ");
        System.out.print(getPerimeter());
    }
}