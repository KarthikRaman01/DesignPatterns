---
name: New API Request Sample
about: Requirement for a new API to be built
title: '[API] <title>'
labels: Backend, Needs Triage
assignees: ''

---
### Requesting Team

| Team          |  Requesting   |
| ------------- | ------------- |
| Client        |      ✅       |
| Business/Sales|               | 
| Server        |               |  

### Core Resource
```
events
```

### Endpoints And Methods
##### GET
/events
\
&nbsp;

### Description
The endpoint requests the core resource - events
\
The client can make use of the response from this API to .
\
&nbsp;

### Path Parameters
|Field Name     | Type   | Required/Optional | Description  | 
|-------------- | ------ | ----------------- |------------- |
| abc_id        | String |   Required        | A abc contains |
<br />

### Query Parameters
| Field Name    | Type  | Required/Optional | Description  |
| ------------- | ----- | ----------------- |------------- |
|   N/A         |  N/A  |   N/A             |       N/A    |
<br />

### Request Headers
| Field Name    |  Type         |  Required/Optional | Description|
| ------------- |-------------- | -----------------  | -----------|
| Authorization |   String      |    Required        | Bearer Token of a |
<br />

### Response Parameters
| Field Name    | Type   | Description   |
| ------------- | ------ | ------------- |
| abc           | String | abc |
| def           | Integer| ID mapped to a def|
| ghi           | Integer| Status of the ghi |
<br />

### Sample Request
```
curl --location --request GET 'http://localhost:8089/event' \
--header 'Authorization: Bearer abc'
```
<br />

### Sample Response
```yaml
[
    {
        "abc": "123",
        "def": 2,
        "ghi": 2
    }
]

Sample Error Response with HTTP Status Code 500

[
    {
        "errorCode": "1801",
        "errorMessage": "Database Connection Failure"
    }
]

