(ns dots.typescript.server.invalidate-cached-typings)

(defn kind
  "**Returns:** `\"action::invalidate\"`"
  ^js [invalidate-cached-typings]
  (.-kind ^js invalidate-cached-typings))

(defn project-name
  "**Returns:** `string`"
  ^js [invalidate-cached-typings]
  (.-projectName ^js invalidate-cached-typings))
