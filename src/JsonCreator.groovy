class JsonCreator{
	def createJson(todoObjList){
		def jsonBuilder = new groovy.json.JsonBuilder()
		jsonBuilder.todo{
			todoObjList.each{ todoObj ->
				id "$todoObj.id"
				entry "$todoObj.entry"
			}
		}
		jsonBuilder.toString()
	}
}

//toString() will return the file as a single line where as toPrettyString() will return it in Json format