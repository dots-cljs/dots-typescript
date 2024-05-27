(ns dots.typescript.server.close-project)

(defn kind
  "**Returns:** `\"closeProject\"`"
  ^js [close-project]
  (.-kind ^js close-project))

(defn project-name
  "**Returns:** `string`"
  ^js [close-project]
  (.-projectName ^js close-project))
