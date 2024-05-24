(ns dots.typescript.server.protocol.project-changes
  "Represents a set of changes that happen in project")

(defn added
  "List of added files"
  ^js [project-changes]
  (.-added ^js project-changes))

(defn set-added!
  "List of added files"
  ^js [project-changes value]
  (set! (.-added ^js project-changes) value))

(defn removed
  "List of removed files"
  ^js [project-changes]
  (.-removed ^js project-changes))

(defn set-removed!
  "List of removed files"
  ^js [project-changes value]
  (set! (.-removed ^js project-changes) value))

(defn updated
  "List of updated files"
  ^js [project-changes]
  (.-updated ^js project-changes))

(defn set-updated!
  "List of updated files"
  ^js [project-changes value]
  (set! (.-updated ^js project-changes) value))

(defn updated-redirects
  "List of files that have had their project reference redirect status updated
   Only provided when the synchronizeProjectList request has includeProjectReferenceRedirectInfo set to true"
  ^js [project-changes]
  (.-updatedRedirects ^js project-changes))

(defn set-updated-redirects!
  "List of files that have had their project reference redirect status updated
   Only provided when the synchronizeProjectList request has includeProjectReferenceRedirectInfo set to true"
  ^js [project-changes value]
  (set! (.-updatedRedirects ^js project-changes) value))
