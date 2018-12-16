/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mlkfinalwork.TeaFactory;

/**
 * @version 1.0
 * @author 马苓珂
 */
public class TeacherUser {
    private String tnumber;//教师号
    private String tname;//教师姓名
    private String tsex;//教师性别
    private String taddress;//家庭住址
    private String ttel;//联系电话
    private String tplace;//单位地址
    private double tjbgz;//基本工资
    private double tjt;//津贴
    private double shbt;//生活补贴
    private double yfgz;//应发工资
    private double dhf;//电话费
    private double sdf;//水电费
    private double fz;//房租
    private double sds;//所得税
    private double wsf;//卫生费
    private double gjj;//公积金
    private double hjkk;//合计扣款
    private double sfgz;//实发工资
    /*
    基本工资、津贴、生活补贴、应发工资、电话费、水电费、房租、所得税、卫生费、公积金、合计扣款、实发工资
    注：应发工资=基本工资+津贴+生活补贴；合计扣款=电话费+水电费+房租+所得税+卫生费+公积金；实发工资=应发工资 － 合计扣款。
    */
    public TeacherUser(){}

    /**
     * @return the tnumber
     */
    public String getTnumber() {
        return tnumber;
    }

    /**
     * @param tnumber the tnumber to set
     */
    public void setTnumber(String tnumber) {
        this.tnumber = tnumber;
    }

    /**
     * @return the tname
     */
    public String getTname() {
        return tname;
    }

    /**
     * @param tname the tname to set
     */
    public void setTname(String tname) {
        this.tname = tname;
    }

    /**
     * @return the tsex
     */
    public String getTsex() {
        return tsex;
    }

    /**
     * @param tsex the tsex to set
     */
    public void setTsex(String tsex) {
        this.tsex = tsex;
    }

    /**
     * @return the taddress
     */
    public String getTaddress() {
        return taddress;
    }

    /**
     * @param taddress the taddress to set
     */
    public void setTaddress(String taddress) {
        this.taddress = taddress;
    }

    /**
     * @return the ttel
     */
    public String getTtel() {
        return ttel;
    }

    /**
     * @param ttel the ttel to set
     */
    public void setTtel(String ttel) {
        this.ttel = ttel;
    }

    /**
     * @return the tplace
     */
    public String getTplace() {
        return tplace;
    }

    /**
     * @param tplace the tplace to set
     */
    public void setTplace(String tplace) {
        this.tplace = tplace;
    }

    /**
     * @return the tjbgz
     */
    public double getTjbgz() {
        return tjbgz;
    }

    /**
     * @param tjbgz the tjbgz to set
     */
    public void setTjbgz(double tjbgz) {
        this.tjbgz = tjbgz;
    }

    /**
     * @return the tjt
     */
    public double getTjt() {
        return tjt;
    }

    /**
     * @param tjt the tjt to set
     */
    public void setTjt(double tjt) {
        this.tjt = tjt;
    }

    /**
     * @return the shbt
     */
    public double getShbt() {
        return shbt;
    }

    /**
     * @param shbt the shbt to set
     */
    public void setShbt(double shbt) {
        this.shbt = shbt;
    }

    /**
     * @return the yfgz
     */
    public double getYfgz() {
        return this.getTjbgz()+this.getShbt()+this.getTjt();
    }


    /**
     * @return the dhf
     */
    public double getDhf() {
        return dhf;
    }

    /**
     * @param dhf the dhf to set
     */
    public void setDhf(double dhf) {
        this.dhf = dhf;
    }

    /**
     * @return the sdf
     */
    public double getSdf() {
        return sdf;
    }

    /**
     * @param sdf the sdf to set
     */
    public void setSdf(double sdf) {
        this.sdf = sdf;
    }

    /**
     * @return the fz
     */
    public double getFz() {
        return fz;
    }

    /**
     * @param fz the fz to set
     */
    public void setFz(double fz) {
        this.fz = fz;
    }

    /**
     * @return the sds
     */
    public double getSds() {
        return sds;
    }

    /**
     * @param sds the sds to set
     */
    public void setSds(double sds) {
        this.sds = sds;
    }

    /**
     * @return the wsf
     */
    public double getWsf() {
        return wsf;
    }

    /**
     * @param wsf the wsf to set
     */
    public void setWsf(double wsf) {
        this.wsf = wsf;
    }

    /**
     * @return the gjj
     */
    public double getGjj() {
        return gjj;
    }

    /**
     * @param gjj the gjj to set
     */
    public void setGjj(double gjj) {
        this.gjj = gjj;
    }

    /**
     * @return the hjkk
     */
    public double getHjkk() {
        //合计扣款=电话费+水电费+房租+所得税+卫生费+公积金
        return this.getDhf()+this.getSdf()+this.getFz()+this.getSds()+this.getWsf()+this.getGjj();
    }

    /**
     * @return the sfgz
     */
    public double getSfgz() {
        //实发工资=应发工资 － 合计扣款。
        return (this.getTjbgz()+this.getShbt()+this.getTjt())-(this.getDhf()+this.getSdf()+this.getFz()+this.getSds()+this.getWsf()+this.getGjj());
    }
}
