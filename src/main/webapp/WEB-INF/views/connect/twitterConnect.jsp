<html>
<head>
    <title>Hello Twitter</title>
</head>
<body>
<h3>Connect to Twitter</h3>
<span th:if="${social_provider_error}">Provider error (maybe you need to configure the app id and secret?)</span>
<form action="/connect/twitter" method="POST">
    <div class="formInfo">
        <p>You aren't connected to Twitter yet. Click the button to connect this application with your Twitter account.</p>
    </div>
    <p><button type="submit">Connect to Twitter</button></p>
</form>
</body>
</html>