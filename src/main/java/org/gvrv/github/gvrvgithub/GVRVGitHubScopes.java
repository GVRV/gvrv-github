package org.gvrv.github.gvrvgithub;

import hudson.Extension;
import org.jenkinsci.plugins.GitHubOAuthScope;

import java.util.Collection;
import java.util.List;
import java.util.Arrays;

@Extension
public final class GVRVGitHubScopes extends GitHubOAuthScope {
    public Collection<String> getScopesToRequest () {
        String s = new String("user");
        List<String> list = Arrays.asList(s.split(","));
        return list;
    }
}
