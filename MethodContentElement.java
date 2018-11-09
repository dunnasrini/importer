package VariabiltyPackage;

public class MethodContentElement implements VariabiltyInterface {

	String variablityType = null;
	String id = null;

	public MethodContentElement(String id, String variablityType) {
		this.variablityType = variablityType;
		this.id = id;
	}

	public void extendsVaribility() {

		System.out
				.println("extendsVariablity MethodContentElement variablityType=> "
						+ variablityType);
		System.out
				.println("extendsVariablity MethodContentElement id==> " + id);
	}

	public void replaceVaribility() {

		System.out
				.println("extendsVariablity MethodContentElement variablityType=> "
						+ variablityType);
		System.out
				.println("extendsVariablity MethodContentElement id==> " + id);
	}

	public void contributesVaribility() {

		System.out
				.println("extendsVariablity MethodContentElement variablityType=> "
						+ variablityType);
		System.out
				.println("extendsVariablity MethodContentElement id==> " + id);
	}

	public void extendsReplaceVaribility() {

		System.out
				.println("extendsVariablity MethodContentElement variablityType=> "
						+ variablityType);
		System.out
				.println("extendsVariablity MethodContentElement id==> " + id);
	}

}
