# Dev container demo with Spring backend and Angular frontend

This project demonstrates [Dev Containers](https://containers.dev/) which simplify setting up a unified development environment for your team. All the required tooling (Java, Node, npm, PostgreSQL) runs inside Docker containers.

It combines a Java Spring backend connected to a database and a JavaScript Angular frontend to showcase multi language development. It is based on the [Java Postgres](https://github.com/devcontainers/templates/tree/main/src/java-postgres) template. Node has been added via [Features](https://containers.dev/features).

## Run the example

You need a running Docker engine and Visual Studio Code, or a similar IDE that supports dev containers.

You can either clone the repository and [open the folder in VS Code](https://code.visualstudio.com/docs/devcontainers/containers#_quick-start-open-an-existing-folder-in-a-container), or you can use VS Code to [clone the repository in a Docker volume](https://code.visualstudio.com/docs/devcontainers/containers#_quick-start-open-a-git-repository-or-github-pr-in-an-isolated-container-volume) and then start it.

Wait for the container to start. You can observe in the log how the container is built from the Dockerfile, how Node and VS Code extensions are installed, how Docker compose is used to start Postgres as well, and how Flyway migrates the database schema.

Once the editor is ready, navigate to the `DemoApplication` class in the explorer and run it, which starts the Spring backend. Open a new terminal, cd into `frontend`, and type `npm run start` to run Angular. After it finished building, open `localhost:4200` in your browser.

## Limitations

The Angular dev server needs to be started with the `--poll` flag under Windows since the file watching mechanism does not work on WSL yet.