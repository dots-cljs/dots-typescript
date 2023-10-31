(ns dots.typescript.server.close-project)

(defn kind
  ^js [close-project]
  (.-kind ^js close-project))

(defn project-name
  ^js [close-project]
  (.-projectName ^js close-project))
