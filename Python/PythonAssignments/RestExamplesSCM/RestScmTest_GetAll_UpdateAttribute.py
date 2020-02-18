import requests
import json

user='scm11.student'
password='sFS68957'
URL="https://adc2-zgtd-fa-ext.oracledemos.com:443/fscmRestApi/resources/11.13.18.05/ideas?q=Name='Super Server XX'"
#?&onlyData=true&limit=29"

data_redu = '?&q=IdeaId="300000181136969"'
   # "IdeaId": 300000186044320,
#"Name": "Super Server XX"
#"Type" : "IDEA",

#json=data
create = requests.get(URL,auth=(user,password),headers={"REST-Framework-Version":"4"})
create_response = create.json()
print(create_response)
idea= create_response["items"]
for attribute in idea :
    print(attribute["Name"],"|",attribute["IdeaId"],"|",attribute["Status"],"|",attribute["Description"])

    ideaIded= str.strip(str(attribute["IdeaId"]))
    urlIdea = str.strip("https://adc2-zgtd-fa-ext.oracledemos.com:443/fscmRestApi/resources/11.13.18.05/ideas/"+ideaIded)
    print("-------------------------------------------",urlIdea)
    data={
        "Status":"Accepted",
        "Description": "Here is alladin."
        }
    print(data)
    update = requests.patch(urlIdea,json=data,auth=(user,password),headers={"REST-Framework-Version":"4"})
    update_response=update.json()
    print("-------------",update_response)
    print(update_response["Status"],"|",update_response["Description"])
with open('PythonAssignments\RestExamplesSCM\demofile_updateAttrib.json', 'w') as outfile:
    json.dump(create_response, outfile)

    # {"REST-Framework-Version":"4"}