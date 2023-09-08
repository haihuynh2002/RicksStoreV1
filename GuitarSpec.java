public class GuitarSpec {
	private String model;
	private int numStrings;
	private Builder builder;
	private Type type;
	private Wood wood;

	public GuitarSpec(String m, int n, Builder b, Type t, Wood w) {
		model = m;
		numStrings = n;
		builder = b;
		type = t;
		wood = w;
	}

	public boolean equals(Object o) {
		if(o instanceof GuitarSpec) {
			GuitarSpec spec = (GuitarSpec) guitar;
			if(!model.equals(spec.model)) return false;
			if(!numStrings == spec.numStrings) return false;
			if(!builder.equals(spec.builder)) return false;
			if(!type.equals(spec.type)) return false;
			if(!wood.equals(spec.wood)) return false;
			return true;
		}
		return false;
	}
}