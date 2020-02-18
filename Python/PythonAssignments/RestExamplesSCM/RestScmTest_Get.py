import requests
import json

user='scm11.student'
password='sFS68957'
URL='https://adc2-zgtd-fa-ext.oracledemos.com:443/fscmRestApi/resources/11.13.18.05/ideas?&q=IdeaId="300000186044320"'

data_redu = '?&q=IdeaId="300000181136969"'
   # "IdeaId": 300000186044320,
#"Name": "Super Server XX"
#"Type" : "IDEA",
data ={
    "items":[
		        {
                    "Type": "IDEA",
                    "IdeaId": 300000186044320
                }
            ],
    "limit" : 1
}
#json=data
create = requests.get(URL,auth=(user,password),headers={"REST-Framework-Version":"1"})

create_response = create.json()
print(create_response)


with open('PythonAssignments\RestExamplesSCM\demofile2.json', 'w') as outfile:
    json.dump(create_response, outfile)

    # {"REST-Framework-Version":"4"}