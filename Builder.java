public enum Builder {
	BUILDER_01("Builder 01"), BUILDER_02("Builder 02"), BUILDER_03("Builder 03");

	private String notation;

	private Builder(String notation) {
		this.notation = notation;
	}

	public String toString() {
		return notation;
	}
}

public enum Type {
	TYPE_01("Type 01"), TYPE_02("Type 02"), TYPE_03("Type 03");

	String notation;
	private Type(String notation) {
		this.notation = notation;
	}

	public String toString() {
		return notation;
	}
}

public enum Wood {
	WOOD_01(), WOOD_02(), WOOD_03;

	private String notation;
	private Wood(String notation) {
		this.notation = notation;
	}

	public String toString() {
		return notation;
	}
}
