<h1>Employee Registration API</h1>

<p>API for registering employees using Java and Spring Boot, designed for secure and organized employee management. This project includes CRUD operations, token-based authentication for specific endpoints, and is built with a modular architecture using best practices.</p>

<h2>Technologies Used</h2>
<ul>
  <li><strong>Java</strong>: Core programming language for backend development.</li>
  <li><strong>Spring Boot</strong>: Framework for building and running the application.</li>
  <li><strong>Spring Data JPA</strong>: To manage database operations with an ORM approach.</li>
  <li><strong>MySQL</strong>: Database used to store employee information.</li>
  <li><strong>Swagger</strong>: For API documentation and interactive testing of endpoints.</li>
  <li><strong>Maven</strong>: Dependency management and project build automation.</li>
</ul>

<h2>Features</h2>
<ul>
  <li>Employee management (CRUD operations)</li>
  <li>Role-based endpoint access control</li>
  <li>Swagger integration for API documentation</li>
</ul>

<h2>Getting Started</h2>

<h3>Prerequisites</h3>
<ul>
  <li><strong>Java 17</strong> or higher</li>
  <li><strong>MySQL</strong> (configure the database connection in <code>application.properties</code>)</li>
  <li><strong>Maven</strong></li>
</ul>

<h3>Installation</h3>
<ol>
  <li>Clone the repository:
    <pre><code>git clone https://github.com/ThalesChamone/API-JAVA.git</code></pre>
  </li>
  <li>Navigate to the project directory:
    <pre><code>cd API-JAVA.git</code></pre>
  </li>
  <li>Install dependencies:
    <pre><code>mvn install</code></pre>
  </li>
  <li>Set up MySQL database and configure <code>src/main/resources/application.properties</code> with your database details.</li>
</ol>

<h3>Running the Application</h3>
<p>Start the application using Maven:</p>
<pre><code>mvn spring-boot:run</code></pre>
<p>The API will be accessible at <a href="http://localhost:8080">http://localhost:8080</a>.</p>

<h3>API Documentation</h3>
<p>Swagger documentation is available at:</p>
<pre><a href="http://localhost:8080/swagger-ui.html">http://localhost:8080/swagger-ui.html</a></pre>

<h2>API Endpoints</h2>
<ul>
  <li><strong>Employee CRUD</strong>:
    <ul>
      <li><code>POST /api/employees</code>: Create an employee
      <li><code>GET /api/employees/{id}</code>: Retrieve employee details</li>
      <li><code>PUT /api/employees/{id}</code>: Update employee information</li>
      <li><code>DELETE /api/employees/{id}</code>: Delete an employee</li>
    </ul>
  </li>
</ul>
