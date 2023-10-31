(ns dots.typescript.completion-entry-label-details)

(defn detail
  ^js [completion-entry-label-details]
  (.-detail ^js completion-entry-label-details))

(defn set-detail!
  ^js [completion-entry-label-details value]
  (set! (.-detail ^js completion-entry-label-details) value))

(defn description
  ^js [completion-entry-label-details]
  (.-description ^js completion-entry-label-details))

(defn set-description!
  ^js [completion-entry-label-details value]
  (set! (.-description ^js completion-entry-label-details) value))
