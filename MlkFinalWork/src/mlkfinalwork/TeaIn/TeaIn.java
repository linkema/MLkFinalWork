/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mlkfinalwork.TeaIn;

import mlkfinalwork.TeaFactory.TeacherUser;

import java.util.ArrayList;

/**
 * @version 1.0 基于文本IO输入
 * @author 马苓珂
 */
public interface TeaIn {
    /**
        这是用户进入系统见面后具体功能模块
        * @param tname 教师姓名
        * @param tnumber 教师号
        * @return 查询是否存在此人信息
     */
    public abstract boolean login(String tnumber,String tname);
    /**
     * 这是用户注册功能
     * 传递一个TeacherUser的列表
     */
    
    public abstract void regist(ArrayList<TeacherUser> teacherUserArrayList);
    /**
     * 这是用户更改信息功能
     * @param teacherUser 传过来封装好的对象
     */
    public boolean modify(TeacherUser teacherUser);

    /**
     * 这是用户删除操作所需要用到的方法
     * @param tnumber   利用传过来的tnum找到列表中的对应对象
     * @return 删除操作是否成功
     */
    public boolean remove(String tnumber);
}
