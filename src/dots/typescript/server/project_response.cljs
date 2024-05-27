(ns dots.typescript.server.project-response)

(defn project-name
  "**Returns:** `string`"
  ^js [project-response]
  (.-projectName ^js project-response))

(defn kind
  "**Returns:** `\"action::set\" | \"action::invalidate\" | \"action::packageInstalled\" | \"event::typesRegistry\" | \"event::beginInstallTypes\" | \"event::endInstallTypes\" | \"event::initializationFailed\" | \"action::watchTypingLocations\"`"
  ^js [project-response]
  (.-kind ^js project-response))
