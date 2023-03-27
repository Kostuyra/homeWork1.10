public class Main {
	public static void main(String[] args) {

		taskOne(true);
		taskTwo(taskOne(false));
		taskThree();
	}

	static String taskOne(boolean main) {

		if (main) {
			System.out.println("Задача 1");;
		}

		String firstName = "Ivan";
		String middleName = "Ivanovich";
		String lastName = "Ivanov";
		String fullName = lastName + ' ' + firstName + ' ' + middleName;
		if (main) {
			System.out.println("ФИО сотрудника — " + fullName);
		}
		return fullName;
	}


	static void taskTwo(String fullName) {
		System.out.println("Задача 2");
		fullName = fullName.toUpperCase();
		System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName);
	}

	static void taskThree() {
		System.out.println("Задача 3");
		String fullName = "Иванов Семён Семёнович";
		fullName = fullName.replace("ё","е");
		System.out.println("Данные ФИО сотрудника — " + fullName);
	}

}