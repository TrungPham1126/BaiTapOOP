package Profession;

class Profession {
	private String name;
	private String description;
	private String[] skills;
	private String[] workPlace;
	private String[] tools;

	public Profession(String name, String description, String[] skills, String[] workPlace, String[] tools) {
		this.name = name;
		this.description = description;
		this.skills = skills;
		this.workPlace = workPlace;
		this.tools = tools;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String[] getSkills() {
		return skills;
	}

	public String[] getWorkPlace() {
		return workPlace;
	}

	public String[] getTools() {
		return tools;
	}

	public boolean hasSkill(String skill) {
		for (String s : skills) {
			if (s.equalsIgnoreCase(skill)) {
				return true;
			}
		}
		return false;
	}

	public boolean worksAt(String workplace) {
		for (String wp : workPlace) {
			if (wp.equalsIgnoreCase(workplace)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Profession{name='" + name + "', description='" + description + "', skills=" + String.join(", ", skills)
				+ ", workPlace=" + String.join(", ", workPlace) + ", tools=" + String.join(", ", tools) + '}';
	}
}
