(ns dots.typescript.server.open-file-info)

(defn check-js?
  ^js [open-file-info]
  (.-checkJs ^js open-file-info))
