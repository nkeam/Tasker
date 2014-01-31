class Driver{
	public static void main(String[]args){
		def file = new File("C:/Dev/Projects/Groovy_Practice/tasker/todo.txt")
		def parsedObjList = parseFile(file)
		def jsonFile = makeJson(parsedObjList)
		send(jsonFile)
	}

	def parseFile(file){
		TextParser textParser = new TextParser
		def parsedObjList = textParser.parseFile(file)
	}

	def makeJson(parsedObjList){
		JsonCreator jsonCreator = new JsonCreator
		def jSonFile = jsonCreator.createJson(parsedObjList)

	}

	def send(jsonFile){
		//Some google stuff will happen here n
	}

}