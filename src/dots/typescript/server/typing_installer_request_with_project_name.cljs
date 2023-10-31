(ns dots.typescript.server.typing-installer-request-with-project-name)

(defn project-name
  ^js [typing-installer-request-with-project-name]
  (.-projectName ^js typing-installer-request-with-project-name))
