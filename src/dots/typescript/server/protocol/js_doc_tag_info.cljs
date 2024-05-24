(ns dots.typescript.server.protocol.js-doc-tag-info
  (:refer-clojure :exclude [name]))

(defn name
  "Name of the JSDoc tag"
  ^js [js-doc-tag-info]
  (.-name ^js js-doc-tag-info))

(defn set-name!
  "Name of the JSDoc tag"
  ^js [js-doc-tag-info value]
  (set! (.-name ^js js-doc-tag-info) value))

(defn text
  "Comment text after the JSDoc tag -- the text after the tag name until the next tag or end of comment
   Display parts when UserPreferences.displayPartsForJSDoc is true, flattened to string otherwise."
  ^js [js-doc-tag-info]
  (.-text ^js js-doc-tag-info))

(defn set-text!
  "Comment text after the JSDoc tag -- the text after the tag name until the next tag or end of comment
   Display parts when UserPreferences.displayPartsForJSDoc is true, flattened to string otherwise."
  ^js [js-doc-tag-info value]
  (set! (.-text ^js js-doc-tag-info) value))
