(ns dots.typescript.server.typing-installer-response)

(defn kind
  "**Returns:** `\"action::set\" | \"action::invalidate\" | \"action::packageInstalled\" | \"event::typesRegistry\" | \"event::beginInstallTypes\" | \"event::endInstallTypes\" | \"event::initializationFailed\" | \"action::watchTypingLocations\"`"
  ^js [typing-installer-response]
  (.-kind ^js typing-installer-response))
