package Day3.Encapsulation;

public class OopsConceptDemo {
	   private int serialNum;
	   private String name;
	   private int age;

	   public int getSerialNum() {
	      return this.serialNum;
	   }

	   public void setSerialNum(int serialNum) {
	      this.serialNum = serialNum;
	   }

	   public String getName() {
	      return this.name;
	   }

	   public void setName(String name) {
	      this.name = name;
	   }

	   public int getAge() {
	      return this.age;
	   }

	   public void setAge(int age) {
	      this.age = age;
	   }

	   public String toString() {
	      return "OopsConceptDemo [Serial Number=" + this.serialNum + ", name=" + this.name + ", age=" + this.age + "]";
	   }
	}
