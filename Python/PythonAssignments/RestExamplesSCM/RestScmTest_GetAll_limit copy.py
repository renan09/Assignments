import requests
import json

user='kevin.schott'
password='zIE74648'
URL="https://adc3-zjqa-fa-ext.oracledemos.com:443/fscmRestApi/resources/11.13.18.05/ideas?&onlyData=true&limit=29"


create = requests.get(URL,auth=(user,password),headers={"REST-Framework-Version":"4"})

create_response = create.json()
#print(create_response)
issues= create_response["items"]
for attribute in issues :
    print(attribute["Name"])


with open('demofile_limits56.json', 'w') as outfile:
    json.dump(create_response, outfile)

    # {"REST-Framework-Version":"4"}