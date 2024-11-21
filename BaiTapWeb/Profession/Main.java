package Profession;

public class Main {
	public static void main(String[] args) {
		Profession architect = new Profession("Architect", "Kiến trúc sư thiết kế các công trình và xây dựng.",
				new String[] { "Design", "Creativity", "Problem solving" },
				new String[] { "Architecture firms", "Construction sites" },
				new String[] { "AutoCAD", "SketchUp", "3D Max" });

		Profession doctor = new Profession("Doctor", "Bác sĩ khám chữa bệnh.",
				new String[] { "Medical knowledge", "Diagnosis", "Surgery" }, new String[] { "Hospitals", "Clinics" },
				new String[] { "Stethoscope", "Medical instruments" });

		Profession[] professions = { architect, doctor };

		String skillToSearch = "Design";
		System.out.println("Nghề nghiệp có kỹ năng " + skillToSearch + ":");
		for (Profession p : professions) {
			if (p.hasSkill(skillToSearch)) {
				System.out.println(p);
			}
		}

		String workplaceToSearch = "Hospitals";
		System.out.println("\nNghề nghiệp làm việc tại " + workplaceToSearch + ":");
		for (Profession p : professions) {
			if (p.worksAt(workplaceToSearch)) {
				System.out.println(p);
			}
		}
	}
}