(ns dots.typescript.server.project-response)

(defn project-name
  ^js [project-response]
  (.-projectName ^js project-response))

(defn kind
  ^js [project-response]
  (.-kind ^js project-response))
