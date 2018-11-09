package VariabiltyPackage;

public class MethodBreakDownElement implements VariabiltyInterface {
	String variablityType = null;
	String id = null;

	public MethodBreakDownElement(String variablityType, String id) {
		this.variablityType = variablityType;
		this.id = id;
	}

	public void extendsVaribility() {

		System.out
				.println("extendsVariablity MethodBbreakdown variablityType=> "
						+ variablityType);
		System.out.println("extendsVariablity MethodBbreakdown id==> " + id);
	}

	public void replaceVaribility() {

		System.out
				.println("replaceVaribility MethodBbreakdown variablityType=> "
						+ variablityType);
		System.out.println("replaceVaribility MethodBbreakdown id==> " + id);

	}

	public void contributesVaribility() {

		System.out
				.println("contributesVaribility MethodBbreakdown variablityType=> "
						+ variablityType);
		System.out
				.println("contributesVaribility MethodBbreakdown id==> " + id);
	}

	public void extendsReplaceVaribility() {

		System.out
				.println("extendsReplaceVaribility MethodBbreakdown variablityType=> "
						+ variablityType);
		System.out.println("extendsReplaceVaribility MethodBbreakdown id==> "
				+ id);
	}

}
