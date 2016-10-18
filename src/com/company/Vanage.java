package com.company;

public class Vanage {
    public static void  ourClassiofor(String classname, String...studentname){
            System.out.println("班级名称:"+classname);
            System.out.println("班级成员名单:");
            for (String student:studentname){
                System.out.println(student);
            }
        }
    public static void main(String[] args) {
        // write your code here
        ourClassiofor("物联一般","hfsdkah","fhjksahf","fgajfak","hfkl","ghfsajk","fgkfak");
    }
}
