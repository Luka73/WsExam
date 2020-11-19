# WsExam - Try It!

{
	"info": {
		"_postman_id": "7b683605-5653-4fea-bb49-455522e8ad53",
		"name": "WsExam-MCIT",
		"schema": "https://schema.getpostman.com/json/collection/v2.1.0/collection.json"
	},
	"item": [
		{
			"name": "add",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8087/add?n1=6&n2=5",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8087",
					"path": [
						"add"
					],
					"query": [
						{
							"key": "n1",
							"value": "6"
						},
						{
							"key": "n2",
							"value": "5"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "mul",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8087/mul?n1=4&n2=5",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8087",
					"path": [
						"mul"
					],
					"query": [
						{
							"key": "n1",
							"value": "4"
						},
						{
							"key": "n2",
							"value": "5"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "sub",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8087/sub?n1=18&n2=2",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8087",
					"path": [
						"sub"
					],
					"query": [
						{
							"key": "n1",
							"value": "18"
						},
						{
							"key": "n2",
							"value": "2"
						}
					]
				}
			},
			"response": []
		},
		{
			"name": "div",
			"request": {
				"method": "GET",
				"header": [],
				"url": {
					"raw": "http://localhost:8087/div?n1=42&n2=7",
					"protocol": "http",
					"host": [
						"localhost"
					],
					"port": "8087",
					"path": [
						"div"
					],
					"query": [
						{
							"key": "n1",
							"value": "42"
						},
						{
							"key": "n2",
							"value": "7"
						}
					]
				}
			},
			"response": []
		}
	],
	"protocolProfileBehavior": {}
}
