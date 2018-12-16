/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mlkfinalwork.TeaMenu;

import javax.swing.JOptionPane;

import mlkfinalwork.TeaIn.TeaImpl.TeaImpl;
import mlkfinalwork.TeaIn.TeaIn;
import mlkfinalwork.TeaUtils.UIUtil;
import mlkfinalwork.TeaFactory.TeacherUser;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * @version 1.0 基于文本IO输入
 * @author 马苓珂
 */
public class TeaNewsInput extends javax.swing.JFrame {

    /**479706569
     * Creates new form TeaNewsOutput
     */
    public TeaNewsInput(String tnum,String tname) {
        initComponents();
        init();
        showNews(tnum,tname);
    }

    /**
     * 将教师工资信息一览显示
     * @param tnum
     * @param tname
     */
    private void showNews(String tnum , String tname) {
        BufferedReader br=null;
        try{
            br=new BufferedReader(new FileReader ("TeaUser.txt"));
            String line=null;
            while((line=br.readLine())!=null){
                String []datas=line.split("=");
                if(datas[0].equals(tnum)&&datas[1].equals(tname)){
                    this.jtfnum.setText ( datas[0] );
                    this.jtfname.setText(datas[1]);
                    this.jtfaddress.setText(datas[2]);
                    this.jtfplace.setText(datas[3]);
                    this.jtfsex.setText(datas[4]);
                    this.jtftel.setText(datas[5]);
                    this.jtfdhf.setText(datas[6]);
                    jtffz.setText(datas[7]);
                    jtfgjj.setText(datas[8]);
                    jtfhjkk.setText(datas[9]);
                    jtfsdf.setText(datas[10]);
                    jtfsds.setText(datas[11]);
                    jtfsjgz.setText(datas[12]);
                    jtfshbt.setText(datas[13]);
                    jtfjbgz.setText(datas[14]);
                    jtfjt.setText(datas[15]);
                    this.jtfwsf.setText(datas[16]);
                    this.jtfydgz.setText(datas[17]);
                    /*
                        tu.getTnumber()+"="+tu.getTname()+"="+tu.getTaddress()+"="+
                        tu.getTplace()+"="+tu.getTsex()+"="+tu.getTtel()+"="+tu.getDhf()
                        +"="+tu.getFz()+"="+tu.getGjj()+"="+tu.getHjkk()+tu.getSdf()+"="+
                        tu.getSds()+tu.getSfgz()+"="+tu.getShbt()+"="+tu.getTjbgz()+"="+
                        tu.getTjt()+"="+tu.getWsf()+"="+tu.getYfgz()
                     */
                }
                break;
            }
        }catch(IOException ioe){
            ioe.printStackTrace();
        }finally{
            try {
                br.close();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jLabel121 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jtfnum = new javax.swing.JLabel();
        jtfname = new javax.swing.JLabel();
        jtfsex = new javax.swing.JLabel();
        jtftel = new javax.swing.JLabel();
        jtfaddress = new javax.swing.JLabel();
        jtfplace = new javax.swing.JLabel();
        jtfsds = new javax.swing.JLabel();
        jtfjbgz = new javax.swing.JLabel();
        jtfjt = new javax.swing.JLabel();
        jtfsdf = new javax.swing.JLabel();
        jtfgjj = new javax.swing.JLabel();
        jtffz = new javax.swing.JLabel();
        jtfwsf = new javax.swing.JLabel();
        jtfydgz = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jtfhjkk = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jtfsjgz = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jtfshbt = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtfdhf = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("宋体", 1, 18)); // NOI18N
        jLabel1.setText("教师信息一览");

        jLabel2.setText("教师号");

        jLabel3.setText("姓名");

        jLabel4.setText("性别");

        jLabel5.setText("联系电话");

        jLabel6.setText("联系地址");

        jLabel7.setText("单位名称");

        jButton2.setText("返回");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setText("应得工资");

        jLabel199.setText("公积金");

        jLabel188.setText("水电费");

        jLabel120.setText("房租");

        jLabel166.setText("基本工资");

        jLabel177.setText("津贴");

        jButton5.setText("完成");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel121.setText("生活补贴");

        jLabel155.setText("所得税");

        jtfnum.setText("jLabel9");

        jtfname.setText("jLabel10");

        jtfsex.setText("jLabel11");

        jtftel.setText("jLabel12");

        jtfaddress.setText("jLabel13");

        jtfplace.setText("jLabel14");

        jtfsds.setText("jLabel15");

        jtfjbgz.setText("jLabel16");

        jtfjt.setText("jLabel17");

        jtfsdf.setText("jLabel18");

        jtfgjj.setText("jLabel19");

        jtffz.setText("jLabel20");

        jtfwsf.setText("jLabel21");

        jtfydgz.setText("jLabel22");

        jLabel23.setText("合计扣款");

        jtfhjkk.setText("jLabel24");

        jLabel25.setText("实际工资");

        jtfsjgz.setText("jLabel26");

        jLabel27.setText("卫生费");

        jtfshbt.setText("jLabel28");

        jLabel9.setText("电话费");

        jtfdhf.setText("jLabel10");

        jButton1.setText("修改本信息");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("删除本信息");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel155, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)
                                .addGap(32, 32, 32)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtftel, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel199))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jtfsex, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                            .addComponent(jtfname, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfnum, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel166, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel177, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel188, javax.swing.GroupLayout.Alignment.TRAILING)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jtfsds, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfaddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jtfplace, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel121)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel120)
                                            .addComponent(jLabel27)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtfhjkk)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel25)))
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtfjbgz)
                                    .addComponent(jtfjt)
                                    .addComponent(jtfsdf)
                                    .addComponent(jtfgjj)
                                    .addComponent(jtffz)
                                    .addComponent(jtfwsf)
                                    .addComponent(jtfydgz)
                                    .addComponent(jtfsjgz)
                                    .addComponent(jtfshbt)
                                    .addComponent(jtfdhf))))
                        .addGap(44, 44, 44)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(204, 204, 204))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel166)
                            .addComponent(jtfnum)
                            .addComponent(jtfjbgz))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel177, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jtfname)
                            .addComponent(jtfjt))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfsdf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtfdhf))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel188, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(3, 3, 3)
                                .addComponent(jLabel9))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jtfsex))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtftel)
                    .addComponent(jLabel5)
                    .addComponent(jLabel199)
                    .addComponent(jtfgjj))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel120)
                                .addComponent(jtffz)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtfshbt)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jtfaddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jtfplace)
                    .addComponent(jLabel27)
                    .addComponent(jtfwsf))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel155)
                    .addComponent(jtfsds)
                    .addComponent(jLabel8)
                    .addComponent(jtfydgz))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23)
                    .addComponent(jtfhjkk)
                    .addComponent(jLabel25)
                    .addComponent(jtfsjgz))
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton5)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel155, jLabel2, jLabel3, jLabel4, jLabel5, jLabel6, jLabel7});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        IndexTeaUser itu=new IndexTeaUser();
        itu.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        goLogin();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        TeaNewsModify tnm=new TeaNewsModify(jtfnum.getText (),jtfname.getText ());
        tnm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        boolean flag=false;
        flag=new TeaImpl().remove(jtfnum.getText ());
        if(flag){
            JOptionPane.showMessageDialog ( this , "删除成功！自动返回登录界面" );
            this.dispose ();
            WelCome w=new WelCome ();
            w.setVisible(true);
        }
    }//GEN-LAST:event_jButton3ActionPerformed
//返回登入界面
    private void goLogin() {
        WelCome w=new WelCome();
        this.dispose();
        w.setVisible(true);
    }

    /**
     * @param args the command line arguments
     */
//    public static void main(String args[]) {
//         try {
//            /* Set the Nimbus look and feel */
//            //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//            /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//            * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//            */
//            try {
//                for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                    if ("Nimbus".equals(info.getName())) {
//                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                        break;
//                    }
//                }
//            } catch (ClassNotFoundException ex) {
//                java.util.logging.Logger.getLogger(WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (InstantiationException ex) {
//                java.util.logging.Logger.getLogger(WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (IllegalAccessException ex) {
//                java.util.logging.Logger.getLogger(WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//                java.util.logging.Logger.getLogger(WelCome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//            }
//            //</editor-fold>
//            UIManager.setLookAndFeel(MyLookAndFeel.JTATTOO_HIFI);
//            /* Create and display the form */
//            java.awt.EventQueue.invokeLater(new Runnable() {
//                public void run() {
//                    new TeaNewsOutput().setVisible(true);
//                }
//            });
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(WelCome.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            Logger.getLogger(WelCome.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            Logger.getLogger(WelCome.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (UnsupportedLookAndFeelException ex) {
//            Logger.getLogger(WelCome.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jtfaddress;
    private javax.swing.JLabel jtfdhf;
    private javax.swing.JLabel jtffz;
    private javax.swing.JLabel jtfgjj;
    private javax.swing.JLabel jtfhjkk;
    private javax.swing.JLabel jtfjbgz;
    private javax.swing.JLabel jtfjt;
    private javax.swing.JLabel jtfname;
    private javax.swing.JLabel jtfnum;
    private javax.swing.JLabel jtfplace;
    private javax.swing.JLabel jtfsdf;
    private javax.swing.JLabel jtfsds;
    private javax.swing.JLabel jtfsex;
    private javax.swing.JLabel jtfshbt;
    private javax.swing.JLabel jtfsjgz;
    private javax.swing.JLabel jtftel;
    private javax.swing.JLabel jtfwsf;
    private javax.swing.JLabel jtfydgz;
    // End of variables declaration//GEN-END:variables

    private void init() {
        this.setTitle("教师基本信息");
        this.setResizable(false);
        UIUtil.setFrameCenter(this);
        UIUtil.setFrameImage(this);
    }
}