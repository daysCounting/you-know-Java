package collectionDemo;
/***
 * 
 *注意先要 初始化实例 才能调用相应方法。
 * @author dayscounting
 */
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MapTest {

	public Map<String, Student> Students;



	public MapTest() {
		super();
		this.Students = new HashMap<String, Student>();
	}

	public void testPut() {
		// 创建一个Scanner对象，用来获取输入的学生ID和姓名
		Scanner console = new Scanner(System.in);
		int i = 0;
		while (i < 3) {
			System.out.println("请输入学生ID：");
			String ID = console.next();
			// 判断该ID是否被占用
			Student st = Students.get(ID);
			if (st == null) {
				// 提示输入学生姓名
				System.out.println("请输入学生姓名：");
				String name = console.next();
				// 创建新的学生对象
				Student newStudent = new Student(ID, name);
				// 通过调用students的put方法，添加ID-学生映射
				Students.put(ID, newStudent);
				System.out.println("成功添加学生：" + Students.get(ID).getName());
				i++;
			} else {
				System.out.println("该学生ID已被占用！");
				continue;
			}
		}
	}

	public void testKeySet() {
		Set<String> name = Students.keySet();
		System.out.println("the number of student: " + Students.size());
		for (String string : name) {
			Student stud = Students.get(string);
			if (stud != null)
				System.out.println("the keySet is :" + stud.getName());
		}
	}

	public static void main(String[] args) {
		MapTest mt = new MapTest();
		mt.testPut();
		mt.testKeySet();
	}

}
