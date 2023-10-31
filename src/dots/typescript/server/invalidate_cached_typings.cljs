(ns dots.typescript.server.invalidate-cached-typings)

(defn kind
  ^js [invalidate-cached-typings]
  (.-kind ^js invalidate-cached-typings))

(defn project-name
  ^js [invalidate-cached-typings]
  (.-projectName ^js invalidate-cached-typings))
