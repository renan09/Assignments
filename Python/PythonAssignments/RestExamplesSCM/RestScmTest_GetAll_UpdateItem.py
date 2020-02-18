import requests
import json

user='scm11.student'
password='sFS68957'
URL="https://adc2-zgtd-fa-ext.oracledemos.com:443/fscmRestApi/resources/11.13.18.05/ideas"
#?&onlyData=true&limit=29"

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
create = requests.get(URL,auth=(user,password),headers={"REST-Framework-Version":"4"})

create_response = create.json()
#print(create_response)
issues= create_response["items"]
for attribute in issues :
    print(attribute["Name"])
    links = attribute["links"]
    for second_level in links :
        print("------",second_level["name"])

hasMore= create_response["hasMore"]
print("hasMore : ",hasMore)
with open('PythonAssignments\RestExamplesSCM\demofile_FirSecLevel.json', 'w') as outfile:
    json.dump(create_response, outfile)

    # {"REST-Framework-Version":"4"}