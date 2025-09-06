public class Test {
    public static void main(String[] args) {
        
        // Person类测试
        Person person = new Person();
        person.setName("张三");
        person.setGender("男");
        person.setAge(30);
        person.setNationality("中国");
        System.out.println("Person: " + person.getName() + ", " + person.getGender() + ", " + person.getAge() + ", " + person.getNationality());
        person.work();
        
        // Student类测试
        Student student = new Student();
        student.setName("李四");
        student.setGender("女");
        student.setAge(20);
        student.setNationality("中国");
        student.setSchool("清华大学");
        student.setStuNumber("2021001");
        System.out.println("Student: " + student.getName() + ", " + student.getGender() + ", " + student.getAge() + ", " + 
                          student.getNationality() + ", " + student.getSchool() + ", " + student.getStuNumber());
        student.work();
        
        // StudentLeader类测试
        StudentLeader leader = new StudentLeader();
        leader.setName("王五");
        leader.setGender("男");
        leader.setAge(21);
        leader.setNationality("中国");
        leader.setSchool("北京大学");
        leader.setStuNumber("2021002");
        leader.setJob("班长");
        System.out.println("StudentLeader: " + leader.getName() + ", " + leader.getGender() + ", " + leader.getAge() + ", " + 
                          leader.getNationality() + ", " + leader.getSchool() + ", " + leader.getStuNumber() + ", " + leader.getJob());
        leader.work();
        leader.meeting();
        
        // Worker类测试
        Worker worker = new Worker();
        worker.setName("赵六");
        worker.setGender("女");
        worker.setAge(35);
        worker.setNationality("中国");
        worker.setUnit("建筑公司");
        worker.setWorkAge(10);
        System.out.println("Worker: " + worker.getName() + ", " + worker.getGender() + ", " + worker.getAge() + ", " + 
                          worker.getNationality() + ", " + worker.getUnit() + ", " + worker.getWorkAge());
        worker.work();
        

        Person person2 = new Person("张三丰", "男", 80, "中国");
        System.out.println("Person: " + person2.getName() + ", " + person2.getGender() + ", " + person2.getAge() + ", " + person2.getNationality());
        person2.work();
        
        Student student2 = new Student("小龙女", "女", 18, "中国", "古墓学院", "GM001");
        System.out.println("Student: " + student2.getName() + ", " + student2.getGender() + ", " + student2.getAge() + ", " + 
                          student2.getNationality() + ", " + student2.getSchool() + ", " + student2.getStuNumber());
        student2.work();
        
        StudentLeader leader2 = new StudentLeader("杨过", "男", 22, "中国", "古墓学院", "GM002", "学部部长");
        System.out.println("StudentLeader: " + leader2.getName() + ", " + leader2.getGender() + ", " + leader2.getAge() + ", " + 
                          leader2.getNationality() + ", " + leader2.getSchool() + ", " + leader2.getStuNumber() + ", " + leader2.getJob());
        leader2.work();
        leader2.meeting();
        
        Worker worker2 = new Worker("郭靖", "男", 25, "中国", "襄阳城建局", 5);
        System.out.println("Worker: " + worker2.getName() + ", " + worker2.getGender() + ", " + worker2.getAge() + ", " + 
                          worker2.getNationality() + ", " + worker2.getUnit() + ", " + worker2.getWorkAge());
        worker2.work();
    }
}