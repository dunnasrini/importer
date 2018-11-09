package VariabiltyPackage;


public class VariabiltyCreation {
	
   
	public VariabiltyInterface applyVaribility(String elementType,String id, String varType){
   	
		if (elementType.equalsIgnoreCase("MethodBreakDownElement")) {
			MethodBreakDownElement methodBD = new MethodBreakDownElement(id,
					varType);
			if (varType == "extends")
				methodBD.extendsReplaceVaribility();

			else if (varType == "replace")
				methodBD.replaceVaribility();

			else if (varType == "contributes")
				methodBD.contributesVaribility();
			else if (varType == "extendsReplace")
				methodBD.extendsReplaceVaribility();

		} else if (elementType.equalsIgnoreCase("MethodContentElement")) {
			MethodContentElement methodCE = new MethodContentElement(id,
					varType);
			if (varType == "extends")
				methodCE.extendsVaribility();
			else if (varType == "replace")
				methodCE.replaceVaribility();

			else if (varType == "contributes")
				methodCE.contributesVaribility();

			else if (varType == "extendsReplace")
				methodCE.extendsReplaceVaribility();

		} 
      
      return null;
   }
}