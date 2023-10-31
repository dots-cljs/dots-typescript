(ns dots.typescript.server.watch-typing-locations)

(defn files
  "if files is undefined, retain same set of watchers"
  ^js [watch-typing-locations]
  (.-files ^js watch-typing-locations))

(defn kind
  ^js [watch-typing-locations]
  (.-kind ^js watch-typing-locations))

(defn project-name
  ^js [watch-typing-locations]
  (.-projectName ^js watch-typing-locations))
