package com.yuye.chain;

/**
 * 测试
 *
 * @Author yuye
 * @Date 2021/2/26 12:52 上午
 */
public class Client {
    public static void main(String[] args) {
        //创建节点
        GroupLeader gl = new GroupLeader();
        ProjectManager pm = new ProjectManager();
        DepartmentManager dm = new DepartmentManager();
        CEO ceo = new CEO();
        //建立责任链
        gl.setHandler(pm);
        pm.setHandler(dm);
        dm.setHandler(ceo);
        gl.approve(1d);

    }
}
